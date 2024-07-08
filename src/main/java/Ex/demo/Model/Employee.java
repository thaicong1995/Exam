    package Ex.demo.Model;

    import com.fasterxml.jackson.annotation.JsonBackReference;
    import jakarta.persistence.*;

    @Entity
    @Table(name = "employee")
    public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String name;
        private int salary;

        @ManyToOne
        @JoinColumn(name = "position_id")
        @JsonBackReference
        private Position position;

        @ManyToOne
        @JoinColumn(name = "department_id")
        @JsonBackReference
        private Department department;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public Position getPosition() {
            return position;
        }

        public void setPosition(Position position) {
            this.position = position;
        }

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }

    }