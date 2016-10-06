package com.nfl.glitr.graphql.data.query;

import com.nfl.glitr.graphql.domain.graph.annotation.GlitrArgument;
import com.nfl.glitr.graphql.domain.graph.annotation.GlitrForwardPagingArguments;
import com.nfl.glitr.graphql.registry.RelayNode;

import java.util.List;

public class QueryType {

    @GlitrForwardPagingArguments
    public List<Video> getVideos() {
        return null;
    }

    @GlitrArgument(name = "id", type = String.class , nullable = false)
    public Video getVideo() {
        return null;
    }

    @RelayNode
    @GlitrArgument(name = "id", type = String.class, nullable = false)
    public Object getNode() { return null; }
}