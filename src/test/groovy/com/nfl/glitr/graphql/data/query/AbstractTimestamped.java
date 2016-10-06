package com.nfl.glitr.graphql.data.query;

public abstract class AbstractTimestamped {
    private Long lastModifiedDate;

    public Long getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}