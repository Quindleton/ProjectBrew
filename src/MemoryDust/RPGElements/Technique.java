package MemoryDust.RPGElements;

import org.w3c.dom.NamedNodeMap;
import MemoryDust.*;

public class Technique {

    private String name;
    private String element;
    private int effectAmt;
    private String effectType;
    private String addedEffectType;
    private Float addedEffectChance;

    public void populateTechniqueInfo(NamedNodeMap techniqueInfo) {
        name = techniqueInfo.getNamedItem("name").getNodeValue();
        element = techniqueInfo.getNamedItem("element").getNodeValue();
        effectAmt = Integer.parseInt(techniqueInfo.getNamedItem("effectAmt").getNodeValue());
        effectType = techniqueInfo.getNamedItem("effectType").getNodeValue();
        addedEffectType = techniqueInfo.getNamedItem("addedEffectType").getNodeValue();
        addedEffectChance = Float.parseFloat(techniqueInfo.getNamedItem("addedEffectChance").getNodeValue());
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        return element;
    }

    public int getEffectAmt() {
        return effectAmt;
    }

    public String getEffectType() {
        return effectType;
    }

    public String getAddedEffectType() {
        return addedEffectType;
    }

    public Float getAddedEffectChance() {
        return addedEffectChance;
    }
}
