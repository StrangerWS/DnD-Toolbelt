package com.strangerws.dnd.info.api.entity.card;

import java.util.List;

public class HtmlCard extends BaseCard {

    private List<String> params;

    public HtmlCard(Integer id, String title, List<String> params) {
        super(id, title);
        this.params = params;
    }

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }
}
