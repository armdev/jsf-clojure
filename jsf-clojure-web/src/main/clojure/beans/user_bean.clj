(ns beans.user-bean
  (:gen-class
   :name UserBean
   :methods [[getUsername [] String]]))


(defn -getUsername
  [this]
  "(Hello \"Clojure!!!! I am JSF 2.2!!!! How are you? \")")
