(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  ( cond (nil? x) false
         (false? x) false
          :else   true)
  )

(defn abs [x]
  (if (> x 0) x (- x))
  )

(defn divides? [divisor n]
  (if (== 0 (mod n divisor)) true false)
  )

(defn fizzbuzz [n]
  (cond (divides? 15 n) "gotcha!"

        (divides? 5 n) "buzz"
        (divides? 3 n) "fizz"
         :else            ""  ))

(defn teen? [age]

  (if (and (< age 20) (> age 12)) true false)
   )

(defn not-teen? [age]
  (not (teen? age))

  )

(defn generic-doublificate [x]
  (cond (number? x) (* 2 x)
        (and (or (list? x) (vector? x) ) (not (empty? x))) (* 2 (count x))
        (empty? x)  nil
        :else       true
        ))

(defn leap-year? [year]

  ( cond (divides? 400 year) true
         (divides? 100 year) false
         (divides? 4 year) true
         :else             false
    ))

; '_______'
