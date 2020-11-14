(ns exercise3)

(defn fibonacci
  "Calculates the fibonacci result fo the given input value."
  [x]
  (case x 
  			0 x 
  			1 x
  			(+ (fibonacci (- x 1)) (fibonacci (- x 2))))
)




