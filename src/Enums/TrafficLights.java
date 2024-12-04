package Enums;

public enum TrafficLights {
    RED ("Stop"),
    YELLOW ("Prepare"),
    GREEN ("Go");

    private final String action;

    TrafficLights(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}






//            {
//        @Override
//        public String getAction() {
//            return "Stop";
//        }
//    }
//    {
//        @Override
//        public String getAction() {
//            return "Prepare to stop";
//        }
//    }
//    {
//        @Override
//        public String getAction() {
//            return "Go";
//        }
//    }