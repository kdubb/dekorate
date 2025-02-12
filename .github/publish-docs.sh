#!/bin/bash
version=$1;

yq eval ".release.current-version = \"$version\"" docs/_data/project.yml | sponge docs/_data/project.yml
git checkout -b gh-pages
git add docs/_data/project.yml
git commit -m "chore: update project version for Dekorate docs."
git push origin -u gh-pages

