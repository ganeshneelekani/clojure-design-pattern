(ns clojure-design-pattern.behavioral.command.clojure.command)

(defn execute [command args]
  (command args))

(defn switch-on [val]
  (println "Switching on for " val))

(defn switch-off [val]
  (println "Switching off for " val))

(def light-map
  {:livingRoomLight "Living Room Light"
   :bedRoomLight "Bed Room Light"})

(def fan-map
  {:livingRoomFan "Living Room Fan"
   :bedRoomFan "Bed Room Fan"})

(defn call-function []
  (execute switch-on (light-map :livingRoomLight ))
  (execute switch-on (light-map :bedRoomLight ))
  (execute switch-off (fan-map :livingRoomFan ))
  (execute switch-off (fan-map :bedRoomFan )))

(call-function )


