package grails3.quick.start

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'main', view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
