package demoapi

import grails.rest.*
@Resource(uri='/places', formats=['json', 'xml'])

class Place {

    static constraints = {
        name blank: false
        address blank: false
        city blank: false
        country blank: false
    }

    String name
    String address
    String zip
    String city
    String country
    Float latitude
    Float longitude

}
