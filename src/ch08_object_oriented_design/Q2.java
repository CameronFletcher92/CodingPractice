package ch08_object_oriented_design;

import java.util.LinkedList;
import java.util.List;

public class Q2 {
    public static class CallCenter {
        private LinkedList<Employee> respondents;
        private LinkedList<Employee> managers;
        private LinkedList<Employee> directors;

        private LinkedList<Employee> busy;

        public CallCenter(List<Employee> respondents, List<Employee> managers, List<Employee> directors) {
            this.respondents = new LinkedList<>(respondents);
            this.managers = new LinkedList<>(managers);
            this.directors = new LinkedList<>(directors);

            this.busy = new LinkedList<>();
        }

        public void dispatchCall() throws Exception {
            Employee callee;

            if (respondents.size() > 0) {
                callee = respondents.removeFirst();
            } else if (managers.size() > 0) {
                callee = managers.removeFirst();
            } else if (directors.size() > 0) {
                callee = directors.removeFirst();
            } else {
                throw new Exception("Could not dispatch");
            }

            callee.setIsBusy(true);
            busy.addLast(callee);
        }
    }

    public static class Employee {
        private boolean isBusy;
        private String name;

        public Employee(String name) {
            isBusy = false;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public boolean getIsBusy() {
            return isBusy;
        }

        public void setIsBusy(boolean value) {
            isBusy = value;
        }
    }
}
