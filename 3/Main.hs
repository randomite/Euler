primes :: [Integer]
primes = sieve [2..] where
    sieve (p:xs) = p : sieve [x | x <- xs, x `mod` p > 0]

factorize :: Integer -> [Integer]
factorize i = primeFactors i primes where
    primeFactors 1 _ = []
    primeFactors b (p:ps) | b < p * p = [b]
                          | r == 0 = p : primeFactors q (p:ps)
                          | otherwise = primeFactors b ps
                          where (q, r) = quotRem b p

main :: IO ()
main = print $ maximum $ factorize 600851475143
