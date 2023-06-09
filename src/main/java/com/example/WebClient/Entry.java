package com.example.WebClient;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entry {
        @JsonProperty("API")
        public String aPI;
        @JsonProperty("Description")
        public String description;
        @JsonProperty("Auth")
        public String auth;
        @JsonProperty("HTTPS")
        public boolean hTTPS;
        @JsonProperty("Cors")
        public String cors;
        @JsonProperty("Link")
        public String link;
        @JsonProperty("Category")
        public String category;

    public String getaPI() {
        return aPI;
    }

    public void setaPI(String aPI) {
        this.aPI = aPI;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public boolean ishTTPS() {
        return hTTPS;
    }

    public void sethTTPS(boolean hTTPS) {
        this.hTTPS = hTTPS;
    }

    public String getCors() {
        return cors;
    }

    public void setCors(String cors) {
        this.cors = cors;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
