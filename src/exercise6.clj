(ns exercise6)

(defn faverage
  "Calculates the average of a given sequence."
  [x]
  (/ (+ (reduce max x) (reduce min x)) 2)
)




