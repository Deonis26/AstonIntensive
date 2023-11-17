package HomeWork.Lesson_4;

public class Park {
    public class Attraction{
        private int coast;
        private String name;
        private String workTime;

        public Attraction(int coast, String name, String workTime) {
            this.coast = coast;
            this.name = name;
            this.workTime = workTime;
        }

        public int getCoast() {
            return coast;
        }

        public void setCoast(int coast) {
            this.coast = coast;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWorkTime() {
            return workTime;
        }

        public void setWorkTime(String workTime) {
            this.workTime = workTime;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "coast=" + coast +
                    ", name='" + name + '\'' +
                    ", workTime='" + workTime + '\'' +
                    '}';
        }
    }
}
