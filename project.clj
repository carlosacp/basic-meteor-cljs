(defproject my-project-name "0.0.1"
  :dependencies [[org.clojure/clojurescript "0.0-2173"]]
  :plugins [[lein-cljsbuild "1.0.1"]]
  :cljsbuild {
    :builds {
      :client
      {:source-paths ["client"] ; The directories to include on the client
       :compiler {:output-to "bin/client.cjs" ; Path must contain 'client' and have extension 'cjs'
                  :output-dir "bin/.build/client" ; Must be a folder ignored by Meteor
                  :source-map "bin/client.cjs.map" ; Must be the :output-to path, with an added '.map'
                  :optimizations :simple ; Use :whitespace, :simple, or :advanced
                  :pretty-print true}}
      :server
      {:source-paths ["server"] ; The directories to include on ths server
       :compiler {:output-to "bin/server.cjs" ; Path must contain 'server' and have extension 'cjs'
                  :output-dir "bin/.build/server" ; Must be a folder ignored by Meteor
                  :source-map "bin/server.cjs.map" ; Must be the :output-to path, with an added '.map'
                  :optimizations :simple ; Use :simple, or :advanced
                  :target :nodejs ; Necessary
                  :pretty-print true}}}})
