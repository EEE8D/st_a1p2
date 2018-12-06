# st_a1p2
Software Testing Assignment 1 Part 2 Development

Author: Weijian Zhang

# Assignment 1 part 2 Study Plan

## Theory and Tools
* TDD (theory)
    * unit testing 
        * Mathur Ch.10
* J-Unit 5 (tools)
* Mockito (tools)
* code coverage (theory and tools)
* git (tools)
    * https://rogerdudler.github.io/git-guide/index.zh.html


## choose project
BlackJack 
Interface - console

## Setup develop environment
IntelliJ new project (done)
JUnit 5 (Plugin inserted)
Mockito (Plugin inserted)
code coverage tool (use IntelliJ build-in plugin)
git repo setup (done)

## Developing...
class diagram

#### model
Card
Deck
Player
Dealer
Game

#### controller
PlayGame

#### view
SimpleView

## Report
* (Code-Coverage) Show a programming environment with a project that compiles with 100% unit test-coverage
    *   go to All_1_94_94 folder and open *index.html*
* (TDD usage) git-commit history that shows that you have worked in TDD way
    * open Github, go to commits page, show 
* (Mocking usage) In that project show examples of how mocking is used to test behaviour and to isolate testing of dependent units
    * show *PlayGameTest*
    * show *GameTest*
* (Code-Coverage) Show that you can ﬁnd code not covered by any test by code-coverage
    *  go to All_1_94_94 folder and open *index.html*
* (X-Unit usage) Show source-code for classes and test-classes in GIT
    * open Github
* Complexity of the project
    * number of commits --- 124
    * at least 4 SUT-classes --- 7 
    * dependency injection --- show the different of Deck-Card and Game-Player
    * use mock --- done
    * Objects of classes are created --- Dealer.NewGame(), **new** Deck()
    * The project has a UI --- run program
* Understand TDD
    * *talk about:* write the method before the test or not
* Understand unit-testing
* Understand mockito
* Understand code coverage tool
 
## Question
> 4 topics: TDD, JUnit, Mockito, Code Coverage Tool

* What is a unit?
    * is the smallest testable part of an application
* How does TDD differ from standard types of testing?
    * when: try to fail at first v.s. test at the end of development circle
    * why: build confidence with code v.s. find bug but hard or no time to debug; reduce communication cost 
    * who: developer v.s. developer and tester 
* What is an Oracle?
    * is a mechanism for determining whether a test has passed or failed - use max(a,b) as example
* How does an oracle know what is right?
    * fulfill the requirements or not
* What might you need to change in the SUT in order to make good use of unit testing?, compared to when not doing unit testing. 
* Do all tests need to use asserts?
    * no
* What makes **black box testing** different from **white box testing**?
    * internal structure: unknown v.s. known
    * high level v.s. low level
* Why might we want to use black box testing?
    * all specifications and requirements are fulfilled
* What is the purpose of unit-testing? 
    * to validate that each unit of the software performs as designed.
* What are **equivalence partitioning** and **boundary value analysis**?
    * equivalence partitioning: to divide possible input set to several parts
        * why: can not test all possible input
    * boundary value analysis: test input values near the boundaries of each partition
* Why do we use TDD? What is its purpose?
    * why: build confidence with code v.s. find bug but hard or no time to debug; reduce communication cost 
* If multiple tests are broken, **which tests** are most important to priorities fixing?
    * simplest, shortest code 
* Can we always have 100% code-coverage?
    * this is a stupid question, the good one is do we need to always have 100% code-coverage?
* What are the different types of coverage criteria?
    * so many, just show parts. 
        * Statement Coverage
        * Decision Coverage
        * Condition Coverage
        * Multiple Condition Coverage
        * Condition/Decision Coverage
        * Modified Condition/Decision Coverage
        * Path Coverage
* Why do we use mock objects?
    * use database as example
* What is the difference between a mock, a stub, and a spy?
    * mock: totally fake
    * stub: real but lose details
    * spy: almost real but some methods are fake 
* Does 100% coverage mean we are bug-free?
    * no, exception may not cover 
* Does 100% MCDC coverage mean we are bug-free?
    * no, after exception ...
* Can we prove that we’re 100% bug-free?
    * no, there will always be unexpected things
* In TDD, Why do we go for RED first?
    * want test to drive code
