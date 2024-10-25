package com.ezamora.spock.poc

import spock.lang.Specification

class NewSpec extends Specification {

    def "assertion tips"() {
        given:
        def cities = new LinkedList<City>()
        when:
        cities.add(new City("Chone", 1.2))
        cities.add(new City("Guayas", 2.2))
        cities.add(new City("Manta", 4.2))
        cities.add(new City("Quito", 5.2))
        then:
        cities.get(0).name() == "Chone"

    }
}
