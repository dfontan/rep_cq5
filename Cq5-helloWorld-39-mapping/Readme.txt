CQ5 AND MAPPING

Mapping enables connection between user friendly short url and long url necessary for CQ5. In this way
in CQ5 user can use short urls. For instance he can use: 
<host>/landingpage.html instead of <host>/content/landingpage.html.

You can check mapping in this project by using url:
<host>/landingpage.html



Configuration and testing
=========================
You can check mapping configuration and test it in location:
system/console -> Sling Resource Resolver

In section "Configuration test" you can type some url and after pressing button "Resolve"
result of mapping should be displayed.



Changing mapping location
=========================
Mapping configuration by default is placed under /etc/map.
You can change it in location: 
/system/console/components -> org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl (property: resource.resolver.map.location)



Mapping node
============
Default location:
etc/map/http

Name:
test

Properties:
jcr:primaryType					sling:Mapping
sling:match						[^/]+/landingpage.html
sling:internalRedirect			/content/landingpage.html



More examples
=============
More comercial examples you can find in location:
etc/map.publish/http