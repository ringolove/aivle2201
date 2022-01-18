from django.shortcuts import render
from django.http import HttpResponse
from .models import Curriculum

# Create your views here.
def index1(request):
    return HttpResponse('<u>Hello</u><hr>Bye')

def index2(request):
    return HttpResponse('<u>Hi</u>')

def main(request):
    return HttpResponse('<u>Main</u>')

def home(request):
    return HttpResponse('<u>Home</u>')

def insert(request):
    # 1 create
    Curriculum.objects.create(name='linux')
    
    # 2 save()
    c = Curriculum(name='python')
    c.save()
    
    Curriculum(name='python').save()
    Curriculum(name='django').save()
    
    return HttpResponse('ok')

def show(request):
    curriculum = Curriculum.objects.all()
    # result = ''
    # for c in curriculum:
    #     result += c.name + '<br>'
    # return HttpResponse(result)
    
    #               필수       필수   변경 가능   필수 아님
    return render(
        request, 'firstapp/show.html', {'score':100, 'data': curriculum})