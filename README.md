I would like the main to eventually look something like this to easily change simulations:
(This is example code from someone else's project's pseudo code, so the examples aren't spot on for our card game. 
It would be good to figure out what this high level pseudo code would look like for us before starting writing)

variable_attributes = {
    attribute_1: range(1, 50, 1), 
    attribute_2: [10, 20, 50]
}

gameEngine = GameEngine(
    debug=False, 
    bonus_attack_activator=[1, 6],
    bonus_defense_activator=[1, 2, 3, 4, 5, 6],
    escape_activator=[3], 
    dice_range=[1, 2, 3, 4, 5, 6],
    variable_attributes=variable_attributes
    )

gameEngine.randomizeCharacterAttributes(variations=10)

gameEngine.simulateRealGames(games=100, round_limit=15, players=4, characters_per_stack=11)

gameEngine.exportGameStatsToCsv()

gameEngine.showSummary()



Current plans/ideas:
* 2-4 simulated players ranging from complete random moves to a strategy/bias to certain moves in a turn (action, tax, move card, atk) and what they prioritize where (and when?)

* Record as MUCH data as we can 
    * Card win rate
    * Player strategy win rate
    * Card ELO - which cards are more and less powerful
    * what actions in a turn have a higher payoff

* Hand class
    * Func playCard -> how to avoid a big switch case?? Card class?
    * Func addToActive
    * Func addToSpecial 
    * Func removeFromActive
    * Func removeFromSpecial
    * Array/ArrayList of current cards in hand
    * 2 arrays: active & special

* Card class?
    * if yes, has benefits of having default values but being able to be edited by code from main

* Player class
    * contains Hand class
    * int warBonds
