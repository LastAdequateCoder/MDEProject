CREATE DATABASE LectureDB;

    CREATE TABLE LectureSchedule (
    	ScheduleID INT
    	 NOT NULL
    	,
            LectureHallID 
            INT
            
            ,
            LectureID 
            INT
            
            ,
            Starttime 
            INT
            
            ,
            Duration 
            INT
            
            ,
            LecturerID 
            INT
            
            ,
            RegistrationLectureRelationship 
            INT
            
            ,
        PRIMARY KEY (ScheduleID)
    );
    CREATE TABLE LectureHall (
    	Name VARCHAR
    	 NOT NULL
    	,
            IDLectureHall 
            INT
            
            ,
            Capacity 
            INT
            
            ,
            HallRelationship 
            INT
            
            ,
        PRIMARY KEY (Name)
    );
    CREATE TABLE Lecture (
    	IDLecture INT
    	 NOT NULL
    	,
            NameLecture 
            VARCHAR
            
            ,
            Description 
            VARCHAR
            
            ,
            DurationLecture 
            INT
            
            ,
            MainLecturerID 
            INT
            
            ,
            SubjectIDLecture 
            INT
            
            ,
            LectureIDRelationship 
            INT
            
            ,
        PRIMARY KEY (IDLecture)
    );
    CREATE TABLE Subject (
    	SubjectID INT
    	 NOT NULL
    	,
            SubjectName 
            VARCHAR
            
            ,
        PRIMARY KEY (SubjectID)
    );
    CREATE TABLE LectureRegistration (
    	LectureScheduleID INT
    	 NOT NULL
    	,
            StudentIDRegistration 
            INT
            
            ,
        PRIMARY KEY (LectureScheduleID)
    );
    CREATE TABLE Student (
    	StudentID INT
    	 NOT NULL
    	,
            Firstname 
            VARCHAR
            
            ,
            Lastname 
            VARCHAR
            
            ,
            StudentCardNumber 
            VARCHAR
            
            ,
            StudentRegistrationRelationship 
            INT
            
            ,
        PRIMARY KEY (StudentID)
    );
    CREATE TABLE Lecturer (
    	IDLecturer INT
    	 NOT NULL
    	,
            Firstname 
            VARCHAR
            
            ,
            Lastname 
            VARCHAR
            
            ,
            Bio 
            VARCHAR
            
            ,
            LectureScheduleRelationship 
            INT
            
            ,
            LecturerLectureRelationship 
            INT
            
            ,
        PRIMARY KEY (IDLecturer)
    );
    ALTER TABLE LectureSchedule ADD CONSTRAINT FK_REGISTRATIONLECTURERELATIONSHIP FOREIGN KEY (RegistrationLectureRelationship)
    REFERENCES LectureRegistration (LectureScheduleID);
    ALTER TABLE LectureHall ADD CONSTRAINT FK_HALLRELATIONSHIP FOREIGN KEY (HallRelationship)
    REFERENCES LectureSchedule (LectureID);
    ALTER TABLE Lecture ADD CONSTRAINT FK_LECTUREIDRELATIONSHIP FOREIGN KEY (LectureIDRelationship)
    REFERENCES LectureSchedule (LectureID);
    ALTER TABLE Student ADD CONSTRAINT FK_STUDENTREGISTRATIONRELATIONSHIP FOREIGN KEY (StudentRegistrationRelationship)
    REFERENCES LectureRegistration (StudentIDRegistration);
    ALTER TABLE Lecturer ADD CONSTRAINT FK_LECTURESCHEDULERELATIONSHIP FOREIGN KEY (LectureScheduleRelationship)
    REFERENCES LectureSchedule (LecturerID);
    ALTER TABLE Lecturer ADD CONSTRAINT FK_LECTURERLECTURERELATIONSHIP FOREIGN KEY (LecturerLectureRelationship)
    REFERENCES Lecture (MainLecturerID);
