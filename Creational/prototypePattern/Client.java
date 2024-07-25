package main.java.prototypePattern;

public class Client {
    private static void fillRegistry(StudentRegistry studentRegistry){
        Student july23BegineerBatch = new Student();
        july23BegineerBatch.setBatchName("July23 begineer");
        july23BegineerBatch.setInsName("Umang Agrawal");
        july23BegineerBatch.setAvgBatchPsp(40);
        july23BegineerBatch.setModuleName("LLD2");
        studentRegistry.register("july23BegineerBatch", july23BegineerBatch);

        IntelligentStudent july23IntelligentStudents = new IntelligentStudent();
        july23IntelligentStudents.setInsName("Umang Agrawal");
        july23IntelligentStudents.setIq(160);
        july23IntelligentStudents.setIntelligentScore(100);
        july23IntelligentStudents.setBatchName("fesk");
        july23IntelligentStudents.setModuleName("LLD2");
        studentRegistry.register("july23IntelligentStudents", july23IntelligentStudents);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student hetul = studentRegistry.get("july23BegineerBatch").clone();
        hetul.setName("Hetul");
        hetul.setAge(35);
        hetul.setPsp(80);

        Student anshuman = studentRegistry.get("july23BegineerBatch").clone();
        anshuman.setName("Anshuman dwidedi");
        anshuman.setAge(40);
        anshuman.setPsp(80);

        Student mahendra = studentRegistry.get("july23IntelligentStudents").clone();
        mahendra.setName("Mahendra");
        mahendra.setAge(100);
        mahendra.setPsp(94);
    }

}
