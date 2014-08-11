/**
 * Copyright 2014 Netflix, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.zuul;

import java.util.List;

/**
 * Simple data holder that defines all filters for a given route.
 */
public class FiltersForRoute {
    private final List<PreFilter> preFilters;
    private final List<RouteFilter> routeFilters;
    private final List<PostFilter> postFilters;

    public FiltersForRoute(List<PreFilter> preFilters, List<RouteFilter> routeFilters, List<PostFilter> postFilters) {
        this.preFilters = preFilters;
        this.routeFilters = routeFilters;
        this.postFilters = postFilters;
    }

    public List<PreFilter> getPreFilters() {
        return preFilters;
    }

    public List<RouteFilter> getRouteFilters() {
        return routeFilters;
    }

    public List<PostFilter> getPostFilters() {
        return postFilters;
    }
}
