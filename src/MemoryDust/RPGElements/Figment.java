package MemoryDust.RPGElements;

import MemoryDust.FileUtilities.XMLRetriever;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class Figment {

    private String name;
    private HashMap<String,Integer> stats;
    private HashMap<String,Float> statGrowth;
    private ArrayList<Technique> learnedTechniques;

    public Figment(String name){
        this.name = name;
        stats = new HashMap<>();
        statGrowth = new HashMap<>();
        learnedTechniques = new ArrayList<>();
        setUpFigment(name);
    }
    public void setUpFigment(String name){
        setStats();
        setStatGrowth();
        setTechniques();
    }

    private void setTechniques() {
        XMLRetriever XMLRet = new XMLRetriever();
        NodeList Techniques = XMLRet.fetchInfoFromXML("/root/Characters/"+name+"/Techniques/MemoryDust.RPGElements.Technique");
        for(int i = 0;i<Techniques.getLength();i++){
            NamedNodeMap TechniqueInfo = Techniques.item(i).getAttributes();
            Technique newTechnique = new Technique();
            newTechnique.populateTechniqueInfo(TechniqueInfo);
            learnedTechniques.add(newTechnique);
        }
    }
    private void setStatGrowth() {
        XMLRetriever XMLRet = new XMLRetriever();
        NamedNodeMap statsGrowth = XMLRet.fetchInfoFromXML("/root/Characters/"+name+"/StatGrowth").item(0).getAttributes();
        for(int i = 0;i<statsGrowth.getLength();i++){
            this.statGrowth.put(statsGrowth.item(i).getNodeName(),Float.parseFloat(statsGrowth.item(i).getNodeValue()));
        }
    }
    private void setStats(){
        XMLRetriever XMLRet = new XMLRetriever();
        NamedNodeMap stats = XMLRet.fetchInfoFromXML("/root/Characters/"+name+"/Stats").item(0).getAttributes();
        for(int i = 0;i<stats.getLength();i++){
            this.stats.put(stats.item(i).getNodeName(),Integer.parseInt(stats.item(i).getNodeValue()));
        }
    }
    public String getName(){
        return name;
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }
}
