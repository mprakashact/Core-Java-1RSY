package Abstraction.Interface.OrgRulesScenario;

interface OrgRules{
    int hike=10;
    int leaves=10;

    void attendOffice();
    void applyLeaves();
    void provideSalary();
}

// From Default All Variables are Final & Static in interface
// All methods are abstract
// can't create object in interface
// In an interface, methods and variables can be public / default. 
// interface, method and variables can't private and protect