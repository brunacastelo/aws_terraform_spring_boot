terraform {
  required_version = ">= 1.0.3"
}

provider "aws" {
  region = "sa-east-1"
}

resource "aws_s3_bucket" "bruna-personal-bucket" {
    bucket = "bruna-personal-bucket"
}