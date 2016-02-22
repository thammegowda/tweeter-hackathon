class BootStrap {

    def solrService


    def init = { servletContext ->
        if (!solrService.healthy) {
            throw new Exception("Solr service is not healthy")
        }
    }

    def destroy = {
        solrService.close()
    }
}
