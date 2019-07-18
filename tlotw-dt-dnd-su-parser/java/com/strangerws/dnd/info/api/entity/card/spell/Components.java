package com.strangerws.dnd.info.api.entity.card.spell;

import com.sun.istack.internal.Nullable;

public class Components {

    private Boolean verbal;
    private Boolean somatic;
    private String material;
    private Boolean isMaterialConsumed;

    public Components(Boolean verbal, Boolean somatic, String material,
            Boolean isMaterialConsumed) {
        this.verbal = verbal;
        this.somatic = somatic;
        this.material = material;
        this.isMaterialConsumed = isMaterialConsumed;
    }

    @Nullable
    public Boolean getVerbal() {
        return verbal;
    }

    public void setVerbal(Boolean verbal) {
        this.verbal = verbal;
    }

    @Nullable
    public Boolean getSomatic() {
        return somatic;
    }

    public void setSomatic(Boolean somatic) {
        this.somatic = somatic;
    }

    @Nullable
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Nullable
    public Boolean getMaterialConsumed() {
        return isMaterialConsumed;
    }

    public void setMaterialConsumed(Boolean materialConsumed) {
        isMaterialConsumed = materialConsumed;
    }

    @Override
    public String toString() {
        return "Components{" +
                "verbal=" + verbal +
                ", somatic=" + somatic +
                ", material='" + material + '\'' +
                ", isMaterialConsumed=" + isMaterialConsumed +
                '}';
    }
}
