layui.use(['table', 'form', 'layer', 'jquery'], function () {
    var table = layui.table;
    var form = layui.form;
    var layer = layui.layer;
    var $ = jQuery = layui.$;
    var name = $("#name");
    form.on('submit(area_form)', function (data) {
        $.ajax({
            url: "/area/savearea",
            data: {name: name.val()},
            success: function (data) {
                msg(layer, trender, data, "添加");
            }
        })
        return false;
    });
    //第一个实例
    var trender = table.render({
        elem: '#areatable'
        , height: 472
        , width: 800
        , url: '/area/listarea' //数据接口
        , page: true //开启分页
        , cols: [
            [ //表头
                {fixed: "left", type: 'checkbox'}
                , {field: 'aid', title: 'ID', sort: true, fixed: 'left'}
                , {field: 'name', title: '用户名'}
                , {fixed: 'right', align: 'center', toolbar: '#btnbar'}
            ]
        ]
    });

    var $ = layui.$, active = {
        deleteRecords: function () { //批量删除
            var checkStatus = table.checkStatus('areatable')
                , data = checkStatus.data;
            if (data.length > 0) {
                removeRecords($, layer, trender, data)
            } else {
                layer.msg('请选择数据', {
                    icon: 2,
                    time: 1000 //1秒关闭（如果不配置，默认是3秒）
                })
            }
        }
        , saveRecords: function () { //批量导入
            var checkStatus = table.checkStatus('areatable')
                , data = checkStatus.data;
            var arr = [];
            for (var i = 0; i < data.length; i++) {
                arr.push(data[i]);
            }
            layer.confirm('导入？', {
                btn: ['确认', '取消'],
                closeBtn: 0,
                yes: function (index, layero) {
                    $.ajax({
                        url: "/area/saverecords",
                        data: JSON.stringify(arr),
                        type: "POST",
                        datType: "JSON",
                        contentType: "application/json",
                        success: function (data) {
                            if (data == "success") {
                                layer.msg('批量导入成功', {
                                    icon: 1,
                                    time: 1000 //1秒关闭（如果不配置，默认是3秒）
                                }, function () {
                                    trender.reload();
                                });
                            }
                        },
                        error: function (a, b, c) {
                            alert(a + "**" + b + "**" + c);
                        }
                    })
                    layer.close(index);
                }, btn2: function () {
                }
            });
        }
    };

    $('.demoTable .layui-btn').on('click', function () {
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });

    table.on('tool(areatable)', function (obj) {
        var data = obj.data;
        if (obj.event === 'del') {
            layer.confirm('确认删除记录？', function (index) {
                obj.del();
                $.ajax({
                    url: "/area/deleterecord",
                    data: {"aid": data.aid},
                    success: function (data) {
                        msg(layer, trender, data, "删除")
                    }
                })
                layer.close(index);
            });
        } else if (obj.event === 'edit') {
        }
    });
})

function removeRecords($, layer, trender, data) {
    var arr = new Array();
    for (var i = 0; i < data.length; i++) {
        arr.push(data[i]);
    }
    layer.confirm('确定删除所选项？', {
        btn: ['确认', '取消'],
        closeBtn: 0,
        yes: function (index, layero) {
            $.ajax({
                url: "/area/deleterecords",
                data: JSON.stringify(arr),
                type: "POST",
                datType: "JSON",
                contentType: "application/json",
                success: function (data) {
                    msg(layer, trender, data, "批量删除")
                }
            })
            layer.close(index);
        }, btn2: function () {
        }
    });
}

function msg(layer, trender, data, msg) {
    if (data == "success") {
        trender.reload();
        layer.msg(msg + '成功', {
            icon: 1,
            time: 1000 //1秒关闭（如果不配置，默认是3秒）
        });
    } else {
        layer.msg(msg + '失败', {
            icon: 1,
            time: 1000 //1秒关闭（如果不配置，默认是3秒）
        })
    }
}