variable "access_key" {
  description = "AWS secret key never share it with anyone"
  type        = string
}

variable "secret_key" {
  type        = string
  description = "never evev share this with anyone, this will be disaster"
}

variable "aws_region" {
  default = "us-east-1"
}

variable "vpc_cidr" {
  default     = "10.0.0.0/16"
  description = "CIDR block of the vpc"
  type        = string
}

variable "public_subnets_cidr" {
  type        = list(any)
  default     = ["10.0.0.0/20", "10.0.128.0/20"]
  description = "CIDR block for Public Subnet"
}

variable "private_subnets_cidr" {
  type    = list(any)
  default = ["10.0.16.0/20", "10.0.144.0/20"]
}

variable "environment" {
  default = "walter_dev"
}

