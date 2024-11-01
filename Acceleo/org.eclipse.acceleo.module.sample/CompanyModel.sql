CREATE DATABASE CompanyModel;

    CREATE TABLE Company (
    	CompanyName VARCHAR
    	 NOT NULL
    	    UNIQUE
    	,
            registrationNumber 
            INT
            
             CHECK (registrationNumber > 0)
            ,
            CompanyEmployee 
            INT
            
                UNIQUE
            ,
            CompanyProject 
            INT
            
                UNIQUE
            ,
        PRIMARY KEY (CompanyName)
    );
    CREATE TABLE Employee (
    	EmployeeID INT
    	 NOT NULL
    	    UNIQUE
    	,
            EmployeeName 
            VARCHAR
            
             CHECK (LENGTH(EmployeeName) > 2)
            ,
            EmployeeAge 
            INT
            
            ,
            EmployeeAddress 
            INT
            
            ,
            postalCode 
            INT
            
            ,
            cityName 
            VARCHAR
            
            ,
            streetName 
            VARCHAR
            
            ,
            EmployeeCompanyRelationship 
            INT
            
            ,
            EmployeeDepartmentRelationship 
            INT
            
            ,
        PRIMARY KEY (EmployeeID)
    );
    CREATE TABLE Department (
    	departmentID INT
    	 NOT NULL
    	,
            departmentName 
            VARCHAR
            
            ,
        PRIMARY KEY (departmentID)
    );
    CREATE TABLE Project (
    	projectID INT
    	 NOT NULL
    	,
            Name 
            VARCHAR
            
            ,
            ProjectCompanyRelationship 
            INT
            
            ,
        PRIMARY KEY (projectID)
    );
    ALTER TABLE Employee ADD CONSTRAINT FK_EMPLOYEECOMPANYRELATIONSHIP FOREIGN KEY (EmployeeCompanyRelationship)
    REFERENCES Company (CompanyEmployee);
    ALTER TABLE Employee ADD CONSTRAINT FK_EMPLOYEEDEPARTMENTRELATIONSHIP FOREIGN KEY (EmployeeDepartmentRelationship)
    REFERENCES Department (departmentID);
    ALTER TABLE Project ADD CONSTRAINT FK_PROJECTCOMPANYRELATIONSHIP FOREIGN KEY (ProjectCompanyRelationship)
    REFERENCES Company (CompanyProject);
