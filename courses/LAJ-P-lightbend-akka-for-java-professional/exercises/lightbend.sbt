resolvers in ThisBuild += "lightbend-commercial-mvn" at "https://repo.lightbend.com/pass/9KW4CqGdOlIhE5Yip9XJbMkfxPbaNmAdW8YeGOGMM89k7q_6/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy", url("https://repo.lightbend.com/pass/9KW4CqGdOlIhE5Yip9XJbMkfxPbaNmAdW8YeGOGMM89k7q_6/commercial-releases"))(Resolver.ivyStylePatterns)