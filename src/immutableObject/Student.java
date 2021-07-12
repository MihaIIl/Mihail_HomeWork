package immutableObject;

public class Student {
    private final String name;
    private final int age;
    private final String speciality;
    private final Stream stream;

    public Student(String name, int age, String speciality, Stream stream){
        this.name = name;
        this.age = age;
        this.speciality = speciality;
        this.stream = (Stream) stream.clone();
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getAge() {
        return age;
    }

    public Stream getStream() {
        return (Stream) stream.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof Student){
            Student s = (Student) obj;
            if (this.hashCode() == s.hashCode()) {
                return this.age == s.age && this.name.equals(s.name) && this.speciality.equals(s.speciality)
                        && this.stream.equals(s.stream);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
