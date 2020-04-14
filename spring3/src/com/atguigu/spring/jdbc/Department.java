package com.atguigu.spring.jdbc;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日
 */
public class Department {

    private Integer id;
    private String departmentName;
    private Integer managerId;
    private Integer locationId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Department() {
    }

    public Department(Integer id, String departmentName, Integer managerId, Integer locationId) {
        this.id = id;
        this.departmentName = departmentName;
        this.managerId = managerId;
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", managerId=" + managerId +
                ", locationId=" + locationId +
                '}';
    }

}
