
@PageCreation
Feature: creation compte
  je veux creer un compte en tant que utilisateur

  @creation
  Scenario: creation compte home
  Given saisir URL 'http://automationexercise.com'
  When Click to Signup_Login
  And whrite Name "Faidafaida"
  And whrite mail "testing@yahoo.fr"
  And Click to the button Signup
  Then Verification information account
  When Fill title
  And Fill Password "afeter321"
  And Fill Date of birth "12" , "4" et "1998"
  And Select checkbox Sign up newsletter
  And Select checkbox Receive special offers partners
  And Fill First name: "test" , Last name: "test ben" , Company: "test" , Address: "taklsa" , Address2: "testour" 
  And Fill again Country: "canada", State: "canada" , City: "canada" , Zipcode: "2009" , Mobile Number: "123456789"
  And Click Create Account button
  Then Verify that "ACCOUNT CREATED!" is visible
  
   @OuvrirCompte
   Scenario: Ouvrir compte
   Given saisir URL 'http://automationexercise.com'
   When Click to Signup_Login
   And  saisir le mail "testing@yahoo.fr"
   And saisir le password pour le login "afeter321"
   And cliquer sur le bouton login2
