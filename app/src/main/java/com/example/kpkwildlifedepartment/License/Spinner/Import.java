package com.example.kpkwildlifedepartment.License.Spinner;

public class Import {

    public String Id;
    public String Import;

    public Import(String id, String anImport) {
        Id = id;
        this.Import = anImport;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getImport() {
        return Import;
    }

    public void setImport(String anImport) {
        Import = anImport;
    }

    @Override
    public String toString() {
        return Import;
    }
}
