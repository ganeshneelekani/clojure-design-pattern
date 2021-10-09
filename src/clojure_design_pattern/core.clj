(ns clojure-design-pattern.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(if (= "Light" buttonName)
  ;; true - Do some operation related to Light
  ;; false- Do some other operation
  )

(if (= "Light" "Light") (println "true") (println "false"))