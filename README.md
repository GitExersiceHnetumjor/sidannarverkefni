# Síðannarverkefni - Epli og Hnetusmjör [![Build Status](https://travis-ci.org/GitExersiceHnetumjor/sidannarverkefni.svg?branch=master)](https://travis-ci.org/GitExersiceHnetumjor/sidannarverkefni)
*Ellen - Hannes - Helgi - Ívar - Ketill - Margrét - Sigurður*

Hér mun síðan eitthvað standa um lausnina okkar.

## [Létt Markdown Cheat Sheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

# Checklist Late-term Assignment
1. ~~The codebase is stored in source control system on GitHub from early start~~
2. ~~The system is setup with an automatic build script.~~
3. ~~The build script runs all unit tests.~~
4. ~~This is not applicable if the project running a Web App on Heroku.~~
5. ~~The build script has deploy/install target that deploys the site on external server (Heroku).~~
6. The business logic should be coded using Test Driven Development.
7. The code should be loosely coupled and follow good object oriented design practices.
8. ~~Documentation uses Markdown syntax.~~
9. ~~Use Automated Continuous Integration Server (e.g.Travis CI).~~
10. Use feature branches and pull request for all features. **It must be clear that this workflow was used the whole time** and that the team was using
reviews before accepting pull-requests. (1 point)
11. More build targets (0,5 point per item, never more than 1 for this part) here
are examples of build targets.
..* Code coverage and other code inspections. Report or other kind of
result must be available outside of the build machine after each run.
..* Integrate database
..* ~~Documentation is converted to another format (e.g PDF or Html) and is
easily accessible outside of the build machine after each run (the build
script needs to publish the documents to an external server).~~ *(held þetta sé nógu gott - spyrja kennara)*
..* Something else ... Surprise us!!!
12. Run focused integration or End-to-end tests (e.g. Selenium). It is necessary
to run this on external staging server (e.g. Heroku). To run integration test
the application needs to connect to external system e.g. database. To run
end-to-end test the system needs to have GUI (e.g. webUI). (1 point)
13. Continuous Delivery. For each code change the CI server runs these steps:
**Only continue next step if previous step is success**
..* Run build script (all targets)
..* Run unit and integration tests (if you have integration tests) Deploy on
staging and run End-to-end tests.
..* Deploy to production server.
..* Generate feedback to developer

**Solving parts 1-9 perfectly will together give a grade of 6**, it's OK to have all
targets in build script manual. Next parts need to be solved incrementally, e.g.
finish part 10 before starting with part 11. **Continuous Delivery is mandatory to
get 10.**
Return form
1. URL of root of the project in the source control system.
2. Documentation. The following report should all be stored in a folder called
docs in the root of the repository.
..* Development manual: what is needed and how to get the project to
build on a fresh machine, Source control client and access to source
control Build environment, Other necessary dependencies for
development.
..* Administration manual: How to set it up and get it to run, also on a
fresh machine. How to deploy, run and maintain
..* Design report: Document describing the initial design.