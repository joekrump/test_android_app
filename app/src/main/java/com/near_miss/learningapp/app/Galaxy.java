package com.near_miss.learningapp.app;

/**
 * Created by DJ on 8/4/2014.
 */
public class Galaxy {
    String galaxyName;
    int galaxySolarSystems;
    int galaxyPlanets;
    long galaxyColonies;
    double galaxyLifeforms;
    int galaxyFleets;
    int galaxyStarships;

    /**
     *
     * @param name
     * @param solarSys
     * @param planets
     */
    public Galaxy(String name, int solarSys, int planets) {
        galaxyName = name;
        galaxySolarSystems = solarSys;
        galaxyPlanets = planets;
        galaxyColonies = 0;
        galaxyLifeforms = 0;
        galaxyFleets = 0;
        galaxyStarships = 0;
    }



    /**
     *
     * @param numberColonies
     */
    void setGalaxyColonies (long numberColonies){
        galaxyColonies = numberColonies;
    }

    /**
     *
     * @return
     */
    long getGalaxyColonies() {
        return galaxyColonies;
    }

    /**
     *
     * @param numberLifeforms
     */
    void setGalaxyPopulation(double numberLifeforms){
        galaxyLifeforms += numberLifeforms;
    }

    /**
     *
     * @return
     */
    double getGalaxyPopulation() {
        return galaxyLifeforms;
    }

    /**
     *
     * @param numberFleets
     */
    void setGalaxyFleets(int numberFleets){
        galaxyFleets = numberFleets;
    }

    /**
     *
     * @return
     */
    int getGalaxyFleets(){
        return galaxyFleets;
    }

    /**
     *
     * @param numberStarships
     */
    void setGalaxyStarships(int numberStarships){
        galaxyStarships = numberStarships;
    }

    /**
     *
     * @return
     */
    int getGalaxyStarships(){
        return galaxyStarships;
    }

    int getGalaxySolarSystems(){
        return galaxySolarSystems;
    }

}
