package ru.netology.domain;

public class Places {
    private int id;
    private String title;
    private int latitude;
    private int longitude;
    private int created;
    private String icon;
    private int checkins;
    private int updated;
    private int type;
    private int country;
    private int city;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public String getTitle() {
        return title;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCheckins() {
        return checkins;
    }

    public void setCheckins(int checkins) {
        this.checkins = checkins;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
