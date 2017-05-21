  import sbt.Resolver

  logLevel := sbt.Level.Info

  resolvers ++= Seq(
    Resolver.bintrayIvyRepo( "dwolla", "sbt-plugins" ),
    Resolver.bintrayIvyRepo( "dwolla", "maven" )
  )

  addSbtPlugin( "com.typesafe.sbt"        %  "sbt-native-packager"    % "1.1.5" )
  addSbtPlugin( "com.dwolla.sbt"          %  "docker-containers"      % "1.2.11")