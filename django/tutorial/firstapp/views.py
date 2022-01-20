from django.shortcuts import render
from django.http import HttpResponse, JsonResponse
from django.views.decorators.csrf import csrf_exempt
from .models import Curriculum
import json

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
    
def req_get(request):
    a = request.GET.get('a')
    b = request.GET.get('b')
    c = request.GET['c']
    result = '%s %s %s' % (a, b, c)
    return HttpResponse(result)

@csrf_exempt
def req_post(request):
    if request.method == 'POST':
        a = request.POST.get('a')
        b = request.POST.get('b')
        c = request.POST['c']
        result = '%s %s %s' % (a, b, c)
        return HttpResponse(result)
    return render(request, 'firstapp/post.html')

def req_ajax4(request):
    return render(request, 'firstapp/ajax4.html')

@csrf_exempt
def req_json(request):
    obj = request.body.decode("utf-8")
    data = json.loads(obj)
    return JsonResponse(data)