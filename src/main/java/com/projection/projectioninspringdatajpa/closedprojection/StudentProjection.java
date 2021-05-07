package com.projection.projectioninspringdatajpa.closedprojection;

public interface StudentProjection {

    /*here require only three properties then we can use projection concept*/

    public Long getId();

    public String getFirstName();

    public String getLastName();
}
