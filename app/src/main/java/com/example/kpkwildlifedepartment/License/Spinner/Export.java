package com.example.kpkwildlifedepartment.License.Spinner;

public class Export {

    public String Id;
    public String Export;

    public Export(String id, String export) {
        Id = id;
        this.Export = export;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getExport() {
        return Export;
    }

    public void setExport(String export) {
        Export = export;
    }

    @Override
    public String toString() {
        return Export;
    }
}
