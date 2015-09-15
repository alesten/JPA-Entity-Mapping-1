package test;

import javax.persistence.Persistence;

public class SchemaBuilder {
    public static void main(String[] args) {
        Persistence.generateSchema("JPA_Entity_Mapping_1PU",null);
    }
}
