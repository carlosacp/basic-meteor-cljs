(ns client)

(defn greeting []
  "Welcome to basic-clojure.")

(defn click-input []
  (if (exists? js/console) (.log js/console "You pressed the button")))

(.log js/console "World!")
(.log js/console js/Meteor)
(.log js/console )

(if (aget js/Meteor "isClient")
  ((set! js/Template.hello.greeting greeting)
   (set! js/Template.hello.events (js-obj "click input" click-input))
  ))

(defn server-startup [] )

(if (aget js/Meteor "isServer" ) server-startup)
