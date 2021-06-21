package com.home365.coredomain.entity;

import com.home365.coredomain.entity.enums.Location;

import javax.persistence.*;

@Entity
@Table(name = "`LOCATION_RULES`")
public class LocationRules {
    private String id;
    private Location locationName;
    private String rules;
    private String pmAccountId;
    private String displayName;

    @Basic
    @Column(name = "pm_account_id")
    public String getPmAccountId() {
        return pmAccountId;
    }

    public void setPmAccountId(String pmAccountId) {
        this.pmAccountId = pmAccountId;
    }

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Enumerated(value = EnumType.STRING)
    @Column(name = "location_name")
    public Location getLocationName() {
        return locationName;
    }

    public void setLocationName(Location locationName) {
        this.locationName = locationName;
    }

    @Basic
    @Column(name = "rules")
    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    @Basic
    @Column(name = "display_name")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocationRules that = (LocationRules) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (locationName != null ? !locationName.equals(that.locationName) : that.locationName != null) return false;
        return rules != null ? rules.equals(that.rules) : that.rules == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (locationName != null ? locationName.hashCode() : 0);
        result = 31 * result + (rules != null ? rules.hashCode() : 0);
        return result;
    }
}
