package com.kaishengit.entitys;

import java.io.Serializable;

/**
 * @author 
 */
public class RolesPowerKey implements Serializable {
    private Integer rolesId;

    private Integer powerId;

    private static final long serialVersionUID = 1L;

    public Integer getRolesId() {
        return rolesId;
    }

    public void setRolesId(Integer rolesId) {
        this.rolesId = rolesId;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RolesPowerKey other = (RolesPowerKey) that;
        return (this.getRolesId() == null ? other.getRolesId() == null : this.getRolesId().equals(other.getRolesId()))
            && (this.getPowerId() == null ? other.getPowerId() == null : this.getPowerId().equals(other.getPowerId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRolesId() == null) ? 0 : getRolesId().hashCode());
        result = prime * result + ((getPowerId() == null) ? 0 : getPowerId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rolesId=").append(rolesId);
        sb.append(", powerId=").append(powerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}