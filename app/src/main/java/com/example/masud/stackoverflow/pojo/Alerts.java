package com.example.masud.stackoverflow.pojo;

import java.util.Map;

public class Alerts {
    private Map<String, String> labels;
    private String otherInfo;

    public void setLabels(Map<String, String> labelMap) {
        for (Map.Entry<String, String> entry : labelMap.entrySet()) {
            this.labels.put(entry.getKey().toLowerCase(), entry.getValue());
        }
    }

//    public void setLabelMap(Map<String, String> labelMap) {
//        this.labels = labelMap;
//    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }
}