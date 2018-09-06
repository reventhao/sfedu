package com.sf.edu.service;


import com.sf.edu.entity.Area;

import java.util.List;

public interface AreaService {
    /**
     *
     *
     * @return
     */
    public List<Area> listArea();

    /**
     *
     * @return
     */
    public int getCount();

    /**
     *
     *
     * @return
     */
    public int saveArea(Area area);

    public Area selectArea(String aid);

    public int removeRecords(List<Integer> records);
}
