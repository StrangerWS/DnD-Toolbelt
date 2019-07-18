package com.strangerws.dnd.info.api.entity.spell;

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

    public Boolean getVerbal() {
        return verbal;
    }

    public void setVerbal(Boolean verbal) {
        this.verbal = verbal;
    }

    public Boolean getSomatic() {
        return somatic;
    }

    public void setSomatic(Boolean somatic) {
        this.somatic = somatic;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Boolean getMaterialConsumed() {
        return isMaterialConsumed;
    }

    public void setMaterialConsumed(Boolean materialConsumed) {
        isMaterialConsumed = materialConsumed;
    }
}
